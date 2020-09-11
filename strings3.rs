fn main() {
    let mut a:String=String::new();
    for c in 0..16 {
	
	a=cat(a,String::from("world\n"))
    }
    println!("={}",&a);
}

fn cat(s:String,ss:String)->String{
	let mut a:String=String::new();
	a.push_str(&s);
	a.push_str(&ss);
	return a;
}
