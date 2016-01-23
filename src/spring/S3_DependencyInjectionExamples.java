package spring;


@RunWith(SpringJU)

public class S3_DependencyInjectionExamples {
	GoodMorningServiceImpl service;
	
	@Test
	public void dummyTest() {
		System.err.println(service.sayHi());
	}
		
}

@Component
class GoodMorningServiceImpl implements S3_HiService {
	@Override
	public String sayHi() {
		return "Good Morning";
	}
}
