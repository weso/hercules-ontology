import os
import requests

from common import OUTPUT_FOLDER, try_create_dir

LODE_ENDPOINT = 'http://150.146.207.114/lode/extract'
ONTOLOGY_URL = 'http://www.weso.es/hercules-ontology/current/asio.xml'
OUTPUT_FILE_NAME = 'asio.html'

def extract_docs_from(onto_url, lode_endpoint):
    payload = {
        'url': onto_url,
        'owlapi': 'true',
        'lang': 'en'
    }
    return requests.get(f"{LODE_ENDPOINT}", params=payload).text

def save_docs(file_name, docs_content):
    with open(file_name, 'w') as f:
        f.write(docs_content)

if __name__ == '__main__':
    try_create_dir(OUTPUT_FOLDER)
    docs_content = extract_docs_from(ONTOLOGY_URL, LODE_ENDPOINT)
    save_docs(os.path.join(OUTPUT_FOLDER, OUTPUT_FILE_NAME), docs_content)
