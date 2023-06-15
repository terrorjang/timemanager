from pydantic import BaseModel

class Group(BaseModel):
    id: int
    name: str
    description: str | None = None

    class Config:
        orm_mode=True