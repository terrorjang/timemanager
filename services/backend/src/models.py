from sqlalchemy import Column, Integer, String, Text, DateTime, ForeignKey
from sqlalchemy.orm import relationship

from database import Base

class Group(Base):
    __tablename__ = "group"

    id = Column(Integer, primary_key=True)
    name = Column(String, nullable=False)
    description = Column(Text)

class Subject(Base):
    __tablename__ = "subject"

    id = Column(Integer, primary_key=True)
    name = Column(String, nullable=False)
    description = Column(Text)
    group_id = Column(Integer, ForeignKey("group.id"))
    group = relationship("Group", backref="subjects")

class Time(Base):
    __tablename__ = "time"

    id = Column(Integer, primary_key=True)
    date = Column(DateTime, nullable=False)
    duration = Column(DateTime, nullable=False)
    create_date = Column(DateTime, nullable=False)
    subject_id = Column(Integer, ForeignKey("subject.id"))
    subject = relationship("Subject", backref="times")

