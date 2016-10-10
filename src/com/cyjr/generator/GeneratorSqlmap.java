package com.cyjr.generator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @ClassName: GeneratorSqlmap
 * @Description: TODO
 * @author liyongfu@tomcat360.com
 * @date 2016年10月10日 下午4:25:42
 * @copyright 浙江雄猫软件开发有限公司
 */
public class GeneratorSqlmap {
	public void generator() throws Exception {

		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			// 指定 逆向工程配置文件
			File configFile = new File(
					"D:\\SoftInstall\\cyjrworkspacests\\MybatisGeneratorDemo\\src\\generatorConfig.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
