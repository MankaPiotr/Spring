package test;

public class Main {

	public static void main(String[] args) {
		String[] s = {"DOOM | Switch", "DOOM | PS4", "DOOM | PC"};
		//System.out.println(s[0].substring(s[0].lastIndexOf(' ') + 1));
		//setText(platform.substring(0, platform.lastIndexOf('|')-1));
		System.out.println(s[0].substring(0, s[0].lastIndexOf('|')-1));
	}
}