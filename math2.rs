fn main() {
    let _c: u64;
    let mut _d: u64;
    for _c in 0..16 {
    _d=mulss( _c,8000);
    println!("={}={}={}",_d,_d/100,_d/10);	
    }

}

fn mulss(i1: u64,i2 : u64)->u64{
	return i1*i2;
}
