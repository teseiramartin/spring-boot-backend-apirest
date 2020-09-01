package com.pinard.spring.boot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpQIBAAKCAQEA1zh0E+ZXt/F+TJwwXwOFN5Q3nQ0JLffapxJwMWBF99GOVEr7\r\n" + 
			"3udKggNXf5PWoK0RgLWtmVz/Jg9rJeaks3FxY5yq7GCL5pnbPruIJvndHwOnlykt\r\n" + 
			"03w6WmCc39anWLel1JcHiOe2MFGdfTkiNxKKodka9HWh8AcATLARangXGuhe2egM\r\n" + 
			"LRx47dN3Nbr81QzCdGCZdHfePAEnDWfIhDorV0eWCjDIO9sXF3ZeV2WRoU25ZyMl\r\n" + 
			"1lRwq0VPAmHvre2+IRhaUMRvvFqxWzyn7G2bZoeTxOGm3/1j5MB75ilVQn5nn1lD\r\n" + 
			"37jkhrbUZXC/UTdBZ7JJ/emgMHFbgeKREbKFIwIDAQABAoIBACLxzp8gimOaeWhU\r\n" + 
			"/+Gdf7bbgQAmCrSFBuKTstXBjPrE8rgrCKRTp5xekIltZq7mCu58ETjSibcTT9Fy\r\n" + 
			"lpFwPPnwiSwiLPT/TELuThgN/+I2RLLdg8xP4mWkRDRv9PIJt4pCD34iKUnFJq4b\r\n" + 
			"ZbvNbecDikXhB68iY+EPwXQpFY9PmTxZIBWbliF3oNRYQ8IF276JXdIVXGAhKdCu\r\n" + 
			"BOvgX4ZTikX2EB1z6Arrum6QCGw46kBBO/hfzwqDTjo9krLuTK/tkJcBZTGw3ACd\r\n" + 
			"CiP95iZifp7dNgJ4ArjL2Hi8iorxEoNAiyuJ8Xo1Ru2HsjnZXsLN+RR8v8XEDIIk\r\n" + 
			"nosy6UECgYEA8g1aOb87SDmW50hE95xNN3kMYbG4STawkQMR8Bdth5dZOUYpihLA\r\n" + 
			"f4kIZ+hjtBOxWesGk9CtHmlBpkILcBlBLuZ8SXvExgkJPH7wcWGSJluaSnAzKDKd\r\n" + 
			"btH83RhKIJzYYn0HdiVMuEbBuiJ2wGfactw51KDvD59KdLnknX/6GUMCgYEA459K\r\n" + 
			"28UlQZ2OR5w3G0adYuRNi5FOFwq3AHnreJS0TrZawLbWI4pF7rK9CE04BSV0wycO\r\n" + 
			"J4DPrjMKvQsEs/d6100IK2DS0G58vndftLODnlG2uRhZNnBpYigKrk65w83PdftY\r\n" + 
			"KzcWem8wYMGBizQ9insX8OOu2SlMYIiYrN4RtqECgYEA2UX7E5MA19g6COnqXonD\r\n" + 
			"FmRmJNuunKmm3MRwuZ+OBgRpZuwAJZynhtOu4/bKaL60mA5MHStX+tBoyaDHO5yv\r\n" + 
			"0jW6owuimlFKJS+dDWmUEzJu0RreENs+TlfYL266O4QPCHlK1VauA0wgYcDF7/hJ\r\n" + 
			"MolUr/S2IsPNxfGHsYlLKpkCgYEAoCUpiNf6r2CHgvBwgPs8riAMQt63f1Sljms4\r\n" + 
			"9TxCY4K+9QluPdECBL+yaY3SlSRWMxteRQLGmzwEGR8QbwH2ZlYnIkXb7JNfpq3c\r\n" + 
			"IwmN16yMD0wHMFsEee/MG/j9j7pUdSCiVr1KTle+RMTAPM1DYxPZszytftIkj2Jr\r\n" + 
			"cGxJMCECgYEAn+AkwRqMOyd1YWomhs9CNLd0V7DGz5/YjCiPZP2XL2F/z9O8+yCN\r\n" + 
			"2kpwBq/wzZZpnpMZirP8Qc3+Tn9O57S31DtC3oLbkLQ4SHDx62wJl5DFJm3bvxA6\r\n" + 
			"xdkhbKqekLZvfTD2jEdrErjSyPU01wmPhRGBBipHLYUXCfVF7p/vzpU=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1zh0E+ZXt/F+TJwwXwOF\r\n" + 
			"N5Q3nQ0JLffapxJwMWBF99GOVEr73udKggNXf5PWoK0RgLWtmVz/Jg9rJeaks3Fx\r\n" + 
			"Y5yq7GCL5pnbPruIJvndHwOnlykt03w6WmCc39anWLel1JcHiOe2MFGdfTkiNxKK\r\n" + 
			"odka9HWh8AcATLARangXGuhe2egMLRx47dN3Nbr81QzCdGCZdHfePAEnDWfIhDor\r\n" + 
			"V0eWCjDIO9sXF3ZeV2WRoU25ZyMl1lRwq0VPAmHvre2+IRhaUMRvvFqxWzyn7G2b\r\n" + 
			"ZoeTxOGm3/1j5MB75ilVQn5nn1lD37jkhrbUZXC/UTdBZ7JJ/emgMHFbgeKREbKF\r\n" + 
			"IwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
