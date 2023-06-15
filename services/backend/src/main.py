from fastapi import FastAPI
from starlette.middleware.cors import CORSMiddleware

from domain.group import group_router

app = FastAPI()


origins = [
    'http://localhost:5173'
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=['*'],
    allow_headers=['*'],
)

app.include_router(group_router.router)
# @app.get("/")
# def home():
#     return "hello, World"