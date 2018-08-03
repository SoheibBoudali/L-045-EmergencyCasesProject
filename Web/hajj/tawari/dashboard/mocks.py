class reports():

	REPORTS=[
		{'id':1,'heartbeat':60,'date': 20180730,'time': 706},
		{'id':1,'heartbeat':60,'date': 20180730,'time': 715},
		{'id':1,'heartbeat':70,'date': 20180730,'time': 720},
		{'id':1,'heartbeat':80,'date': 20180730,'time': 725},
		{'id':1,'heartbeat':90,'date': 20180730,'time': 730},
		{'id':2,'heartbeat':60,'date': 20180730,'time': 706},
		{'id':2,'heartbeat':150,'date': 20180730,'time': 715},
		{'id':2,'heartbeat':200,'date': 20180730,'time': 720},
		{'id':3,'heartbeat':60,'date': 20180730,'time': 706},
		{'id':3,'heartbeat':50,'date': 20180730,'time': 715},
		{'id':3,'heartbeat':55,'date': 20180730,'time': 720},
	]

	@classmethod
	def all(cls):
		return cls.REPORTS
	
		