import os

OUTPUT_FOLDER = os.path.join('build', 'current')

def try_create_dir(dir_name):
    if not os.path.exists(dir_name):
        os.makedirs(dir_name)
