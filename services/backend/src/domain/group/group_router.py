from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session

from database import get_db, SessionLocal
from domain.group import group_schema, group_crud


router = APIRouter(
    prefix='/api/group'
)

@router.get("/list", response_model=list[group_schema.Group])
def group_list(db: Session = Depends(get_db)):
    _group_list = group_crud.get_group_list(db)
    return _group_list
