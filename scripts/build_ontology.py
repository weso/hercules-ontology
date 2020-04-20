import os

from rdflib import Graph

from common import OUTPUT_FOLDER, try_create_dir

ALIGNMENTS_FOLDER = 'alignments'
SRC_FOLDER = 'src'

MERGED_ONTOLOGY_FILE_NAME = 'asio'

FILE_OUTPUT_FORMATS = {
    '.ttl': 'turtle',
    '.xml': 'xml',
    '.json': 'json-ld',
    '.nt': 'nt'
}

def merge_ontologies(file_names, file_format='turtle'):
    graph = Graph()
    for file in file_names:
        graph.parse(file, format=file_format)
    return graph

def retrieve_files_from(folders, filter=None):
    file_names = []
    for folder in folders:
        file_names += [os.path.join(folder, file) for file in os.listdir(folder)]
    return file_names

def save_final_graph(graph, output_name):
    for output_extension, output_format in FILE_OUTPUT_FORMATS.items():
        with open(output_name + output_extension, 'wb') as f:
            res = graph.serialize(format=output_format)
            f.write(res)

if __name__ == '__main__':
    file_names = retrieve_files_from([ALIGNMENTS_FOLDER, SRC_FOLDER])
    merged_graph = merge_ontologies(file_names)
    try_create_dir(OUTPUT_FOLDER)
    save_final_graph(merged_graph, os.path.join(OUTPUT_FOLDER, MERGED_ONTOLOGY_FILE_NAME))
