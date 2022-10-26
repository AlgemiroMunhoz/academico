pip install Flask
from asyncio.windows_utils import pipe
from curses import flash
from flask import Flask

meu_app = Flask(__name__)

@meu_app.route('/')
def to_index():
    return 'ola mundo'
