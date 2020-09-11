fn main() {
    println!("={}",hello());
}

fn hello()->String{
	let a:String=String::from("hello world\n");
	return a;
}
