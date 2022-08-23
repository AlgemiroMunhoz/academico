from flask import Flask

meu_app = Flask(__name__)

@meu_app.route('/')
def to_index():
    return 'ola mundo'
