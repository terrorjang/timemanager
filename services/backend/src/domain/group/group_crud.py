from models import Group
from sqlalchemy.orm import Session

def get_group_list(db: Session):
    return db.query(Group).all()