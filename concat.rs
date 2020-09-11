fn main() {
    println!("={}",cat(String::from("hello "),String::from("world\n")));
}

fn cat(s:String,ss:String)->String{
	let mut a:String=String::new();
	a.push_str(&s);
	a.push_str(&ss);
	return a;
}
