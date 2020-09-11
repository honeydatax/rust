fn main() {
    println!("={}",sstr());
}

fn sstr()->String{
	let mut a:String=String::new();
	let d:&str="hello world\n";
	let e:&str="hello world\n";
	a.push_str(d);
	a.push_str(e);
	return a;
}
