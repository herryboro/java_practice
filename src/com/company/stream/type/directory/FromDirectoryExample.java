package stream.type.directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/test");
		Stream<Path> stream = Files.list(path);
		stream.forEach(a -> System.out.println(a.getFileName()));
	}

}
