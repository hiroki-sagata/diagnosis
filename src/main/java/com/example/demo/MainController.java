package com.example.demo;


import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;


@Controller
public class MainController 
//implements WebMvcConfigurer    //追加-------------
{
@Autowired
UserDataRepository repository;
@Autowired
GoodButtonRepository goodRepository;
@Autowired
ContentDataRepository contentrepository;
//ーーーーーーーーーデフォルトでDBに登録された状態にできるーーーーーーーーーー
//@PostConstruct
//public void init() {
//GoodButton good = new GoodButton();
//good.setPoint(0);
//goodRepository.saveAndFlush(good);
//}
//ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー

@RequestMapping("/")
public ModelAndView index(ModelAndView mv) {
mv.setViewName("index");
return mv;
}
@RequestMapping("/answer")
public ModelAndView answer(ModelAndView mv) {
	mv.setViewName("answer");
	return mv;
}
@RequestMapping("/choose")
public ModelAndView choose(ModelAndView mv) {
	mv.setViewName("choose");
	return mv;
}
@RequestMapping("/choose2")
public ModelAndView choose2(ModelAndView mv) {
mv.setViewName("choose2");
return mv;
}
@RequestMapping("/choose3")
public ModelAndView choose3(ModelAndView mv) {
mv.setViewName("choose3");
return mv;
}
@RequestMapping("/choose4")
public ModelAndView choose4(ModelAndView mv) {
mv.setViewName("choose4");
return mv;
}
@RequestMapping("/choose5")
public ModelAndView choose5(ModelAndView mv) {
mv.setViewName("choose5");
return mv;
}
@RequestMapping("/choose6")
public ModelAndView choose6(ModelAndView mv) {
mv.setViewName("choose6");
return mv;
}
//@RequestMapping("/contact")
//public ModelAndView contact(ModelAndView mv) {
//	mv.setViewName("contact");
//	return mv;
//}
@RequestMapping("/header")
public ModelAndView header(ModelAndView mv) {
	mv.setViewName("header");
	return mv;
}
@RequestMapping("/home")
public ModelAndView home(ModelAndView mv) {
	mv.setViewName("home");
	return mv;
}
@RequestMapping("/side")
public ModelAndView side(ModelAndView mv) {
	mv.setViewName("side");
	return mv;
}
@RequestMapping("/video")
public ModelAndView video(ModelAndView mv) {
	mv.setViewName("video");
	return mv;
}

@RequestMapping("/point")
public ModelAndView point(ModelAndView mv) {
	mv.setViewName("point");
	return mv;
}
@RequestMapping("/form")
public ModelAndView form(ModelAndView mv) {
	mv.setViewName("form");
	return mv;
}
@RequestMapping("/user")
public ModelAndView user(ModelAndView mv) {
	mv.setViewName("user");
	return mv;
}
@RequestMapping("/memory")
public ModelAndView memory(ModelAndView mv) {
	mv.setViewName("memory");
	return mv;
}
@RequestMapping("/mypage")
public ModelAndView mypage(ModelAndView mv) {
	mv.setViewName("mypage");
	return mv;
}





//-----ここまでで表示させている-----



//--------ここからが質問箇所６シート-------- 



@RequestMapping(value="/choose2",method=RequestMethod.POST)
public ModelAndView choose2Post(ModelAndView mv, 
@RequestParam("answer1")int answer1,@RequestParam("answer2")int answer2,
@RequestParam("answer3")int answer3,@RequestParam("answer4")int answer4,
@RequestParam("answer5")int answer5,@RequestParam("answer6")int answer6,
@RequestParam("answer7")int answer7) {
int total1 = 0;
total1 = answer1 + answer2 + answer3 + answer4 + answer5 + answer6 + answer7;
System.out.println("シートAの「はい」の数は"+total1);
mv.addObject("sp1",total1);
mv.setViewName("choose2");
return mv;
}


@RequestMapping(value="/choose3",method=RequestMethod.POST)
public ModelAndView choose3Post(ModelAndView mv, 
@RequestParam("answer2-1")int answer1,@RequestParam("answer2-2")int answer2,
@RequestParam("answer2-3")int answer3,@RequestParam("answer2-4")int answer4,
@RequestParam("answer2-5")int answer5,@RequestParam("answer2-6")int answer6,
@RequestParam("answer2-7")int answer7,@RequestParam("sheet-point1")int total1) {
int total2 = 0;
total2 = answer1 + answer2 + answer3 + answer4 + answer5 + answer6 + answer7;
System.out.println("シートBの「はい」の数は"+total2);
mv.addObject("sp1",total1);
mv.addObject("sp2",total2);
mv.setViewName("choose3");
return mv;
}
@RequestMapping(value="/choose4",method=RequestMethod.POST)
public ModelAndView choose4Post(ModelAndView mv, 
@RequestParam("answer3-1")int answer1,@RequestParam("answer3-2")int answer2,
@RequestParam("answer3-3")int answer3,@RequestParam("answer3-4")int answer4,
@RequestParam("answer3-5")int answer5,@RequestParam("answer3-6")int answer6,
@RequestParam("answer3-7")int answer7,@RequestParam("sheet-point1")int total1,
@RequestParam("sheet-point2")int total2) {
int total3 = 0;
total3 = answer1 + answer2+ answer3 + answer4 + answer5 + answer6 + answer7;
System.out.println("シートCの「はい」の数は"+total3);
mv.addObject("sp1",total1);
mv.addObject("sp2",total2);
mv.addObject("sp3",total3);
mv.setViewName("choose4");
return mv;
}
@RequestMapping(value="/choose5",method=RequestMethod.POST)
public ModelAndView choose5Post(ModelAndView mv, 
@RequestParam("answer4-1")int answer1,@RequestParam("answer4-2")int answer2,
@RequestParam("answer4-3")int answer3,@RequestParam("answer4-4")int answer4,
@RequestParam("answer4-5")int answer5,@RequestParam("answer4-6")int answer6,
@RequestParam("answer4-7")int answer7,@RequestParam("sheet-point1")int total1,
@RequestParam("sheet-point2")int total2,@RequestParam("sheet-point3")int total3) {
int total4 = 0;
total4 = answer1 + answer2+ answer3 + answer4 + answer5 + answer6 + answer7;
System.out.println("シートDの「はい」の数は"+total4);
mv.addObject("sp1",total1);
mv.addObject("sp2",total2);
mv.addObject("sp3",total3);
mv.addObject("sp4",total4);
mv.setViewName("choose5");
return mv;
}
@RequestMapping(value="/choose6",method=RequestMethod.POST)
public ModelAndView choose6Post(ModelAndView mv, 
@RequestParam("answer5-1")int answer1,@RequestParam("answer5-2")int answer2,
@RequestParam("answer5-3")int answer3,@RequestParam("answer5-4")int answer4,
@RequestParam("answer5-5")int answer5,@RequestParam("answer5-6")int answer6,
@RequestParam("answer5-7")int answer7,@RequestParam("sheet-point1")int total1,
@RequestParam("sheet-point2")int total2,@RequestParam("sheet-point3")int total3,
@RequestParam("sheet-point4")int total4) {
int total5 = 0;
total5 = answer1 + answer2+ answer3 + answer4 + answer5 + answer6 + answer7;
System.out.println("シートEの「はい」の数は"+total5);
mv.addObject("sp1",total1);
mv.addObject("sp2",total2);
mv.addObject("sp3",total3);
mv.addObject("sp4",total4);
mv.addObject("sp5",total5);
mv.setViewName("choose6");
return mv;
}
@RequestMapping(value="/answer",method=RequestMethod.POST)
public ModelAndView answerPost(ModelAndView mv, 
@RequestParam("answer6-1")int answer1,@RequestParam("answer6-2")int answer2,
@RequestParam("answer6-3")int answer3,@RequestParam("answer6-4")int answer4,
@RequestParam("answer6-5")int answer5,@RequestParam("answer6-6")int answer6,
@RequestParam("answer6-7")int answer7,@RequestParam("sheet-point1")int total1,
@RequestParam("sheet-point2")int total2,@RequestParam("sheet-point3")int total3,
@RequestParam("sheet-point4")int total4,@RequestParam("sheet-point5")int total5) {
int total6 = 0;
total6 = answer1 + answer2+ answer3 + answer4 + answer5 + answer6 + answer7;
System.out.println("シートFの「はい」の数は"+total6);

int maxScore = 0;
String answerSheet = null;
int [] score = {total1,total2,total3,total4,total5,total6};
for(int i= 0; i < score.length; i++) {
	if(maxScore < score[i]) {
		maxScore = score[i];
		System.out.println("現在の最大値は"+maxScore);
	}
}






//-----------ここから診断結果-----------



if(maxScore == total1) {
	System.out.println("Aのシートが最大");
	String sheetA = "あなたは「サポーター」タイプ";
	String sheetAAnswer = "あなたは人と接し、相手が喜んでくれることや、誰かの役に立つことに喜びを感じるタイプ。自分の利益を追求するよりも人をサポートし、その人が幸せになることで、あなた自身もハッピーになるのでは？ 社会貢献やボランティア活動などへの意識も高く、人に何かを教えることも好きなはず。\n"
			+ "\n"
			+ "ただ、いつも周囲の人間関係や友人関係に気を配って、どこか気疲れしてしまうことが多いかもしれません。利益や売り上げの数字を重視する風土の組織では、ストレスが溜まることも少なくないでしょう。おすすめは誰かをサポートする医療や介護系などの職種。これに向けた資格を目指してみては。";
	mv.addObject("type",sheetA);
	mv.addObject("type_answer",sheetAAnswer);
	mv.addObject("job1","医療、介護職");
	mv.addObject("job2","インストラクター、教育");
	mv.addObject("job3","コールセンター、カウンセリング職");
	answerSheet = "A";
	mv.addObject("choose",answerSheet);
	
}else if(maxScore == total2) {
	System.out.println("Bのシートが最大");
	String sheetB = "あなたは「リーダー」タイプ";
	String sheetBAnswer = "あなたは組織の中でリーダーシップを取って、目的に向かって邁進していくことに喜びを感じるタイプ。組織をまとめたり、企業経営にも関心が高く、積極的に昇進・昇格したいと思っている傾向もあるよう。\n"
			+ "\n"
			+ "自信家で周囲からは指導力があると言われることも多く、社外でも高い社会的地位を得たいと思っていない？ 話術にも長けており、他人と議論をしても、多くの場合は相手を説き伏せて自分の意見を通すみたい。内心そのことに喜びを感じている人が多そう。独立志向も持つあなたは、経営に役立つ中小企業診断士、MBAといった難しい資格にチャレンジもしてみて！";
	mv.addObject("type",sheetB);
	mv.addObject("type_answer",sheetBAnswer);
	mv.addObject("job1","管理職全般");
	mv.addObject("job2","営業、企画、人事・労務");
	mv.addObject("job3","起業家");
	answerSheet = "B";
	mv.addObject("choose",answerSheet);
	
}else if(maxScore == total3) {
	System.out.println("Cのシートが最大");
	String sheetC = "あなたは「事務管理」タイプ";
	String sheetCAnswer ="あなたはデータ、情報、文書などを一定の決まりに従って処理する仕事に強みを発揮するタイプ。クリエイティブな作業はあまり得意ではないのでは？ 物事を正確に記録したり、整理したりする能力は高く、仕事のスキルを熟練させて高めていくことに喜びを感じる人が多いようです。\n"
			+ "\n"
			+ "　変化の多い仕事よりも、ルーティンワークのほうが落ち着いて取り組めるはず。ルールが明確ではっきりしていることを好み、曖昧なことは好きではない傾向も。周囲との人間関係に気を配り、自らがトラブルの原因となることは比較的少ないあなたにピッタリな仕事は事務職系です。";
	mv.addObject("type",sheetC);
	mv.addObject("type_answer",sheetCAnswer);
	mv.addObject("job1","一般事務、経理");
	mv.addObject("job2","秘書、税理士");
	mv.addObject("job3","数字やデータ処理系");
	answerSheet = "C";
	mv.addObject("choose",answerSheet);
	
}else if(maxScore == total4) {
	System.out.println("Dのシートが最大");
	String sheetD = "あなたは「アーティスト」タイプ";
	String sheetDAnswer ="あなたは既成概念に縛られることのない、自由な発想力で人を楽しませたり、驚かせたりすることを好むタイプ。自分で何かを創造することに強い興味を持つ反面、ルーティンワークはあまり好きではないのでは？\n"
			+ "\n"
			+ "　他人の指示に忠実に動く必要のある仕事は不得手で、細かな決まり事のある組織にいると、居心地悪く感じてしまうかもしれません。「美しいもの」に高い価値観を見いだす人が多く、同じタイプの人とは高く共感し合う人が多いようです。普段から感性をみがきながらも、業務に必要な知識を補完する資格にチャレンジしてみては？";
	mv.addObject("type",sheetD);
	mv.addObject("type_answer",sheetDAnswer);
	mv.addObject("job1","商品開発");
	mv.addObject("job2","美容師");
	mv.addObject("job3","デザイナー");
	answerSheet = "D";
	mv.addObject("choose",answerSheet);
	
	
}else if(maxScore == total5) {
	System.out.println("Eのシートが最大");
	String sheetE = "あなたは「職人」タイプ";
	String sheetEAnswer ="あなたは自分のペースでコツコツと何かをやり遂げることを好むタイプ。機械やモノを対象とする仕事への関心が高く、気になるキーワードは「持続的」「実利的」「シンプル」など。料理やクルマの運転、日曜大工など、道具を使いこなすことも得意でしょう。\n"
			+ "\n"
			+ "　金銭や上下関係、社会的な地位など、分かりやすい基準を尊重する傾向もあるようです。獣医など動物相手の根気が必要な仕事にも向いているはずです。ただこのタイプには、対人関係を作っていくのが比較的苦手な人も目立ちます。営業や販売などは避けたほうがいいと言えるでしょう。";
	mv.addObject("type",sheetE);
	mv.addObject("type_answer",sheetEAnswer);
	mv.addObject("job1","プログラマー、CADオペレーター");
	mv.addObject("job2","歯科技師");
	mv.addObject("job3","トリマー");
	answerSheet = "E";
	mv.addObject("choose",answerSheet);
	
}else if(maxScore == total6) {
	System.out.println("Fのシートが最大");
	String sheetF = "あなたは「研究者」タイプ";
	String sheetFAnswer ="あなたはひとりで思索にふけったり、様々な仮説を頭の中で組み立てることが好きなタイプ。あまり感情をむき出しにすることはなく、学者肌でどちらかというと理数系の分野が得意な人が多いはず。仕事の選択においても、売り上げをどんどん伸ばすことよりは、徹底的に調査や研究をするなど、自己の能力が存分に発揮できるかどうかを優先したいと考えているのでは？\n"
			+ "\n"
			+ "　また、このタイプには合理的で、筋道を立てて実証的に物事を考えることを好む人も目立ちます。何かを分析したり、検証しながら組み立てていく仕事を選んでみましょう";
	mv.addObject("type",sheetF);
	mv.addObject("type_answer",sheetFAnswer);
	mv.addObject("job1","医師");
	mv.addObject("job2","研究者");
	mv.addObject("job3","SE（システムエンジニア）");
	answerSheet = "F";
	mv.addObject("choose",answerSheet);
	
}

mv.addObject("maxSheet",maxScore);

mv.setViewName("answer");
return mv;
}

//---------ビデオページの診断結果別表示試し---------
@RequestMapping(value="/video", method = RequestMethod.POST )
public ModelAndView videoPost(ModelAndView mv,
@RequestParam("result")String resultNumber) {
	
	mv.addObject("X",resultNumber);
	mv.addObject("choose",resultNumber);
	switch(resultNumber) {
	case "A":
		mv.addObject("job1","医療、介護職");
		mv.addObject("job2","インストラクター、教育");
		mv.addObject("job3","コールセンター、カウンセリング職");
		
		mv.addObject("helper",true);
		mv.addObject("instructor",true);
		mv.addObject("counselor",true);
		break;
	case "B" :
		mv.addObject("job1","管理職全般");
		mv.addObject("job2","営業、企画、人事・労務");
		mv.addObject("job3","起業家");
		
		mv.addObject("management",true);
		mv.addObject("sales",true);
		mv.addObject("entrepreneur",true);
		break;
	case "C" :
		mv.addObject("job1","一般事務、経理");
		mv.addObject("job2","秘書、税理士");
		mv.addObject("job3","数字やデータ処理系");
		
		mv.addObject("accounting",true);
		mv.addObject("secretary",true);
		mv.addObject("dataentry",true);
		break;
	case "D" :
		mv.addObject("job1","商品開発");
		mv.addObject("job2","美容師");
		mv.addObject("job3","デザイナー");
		
		mv.addObject("productdvelopment",true);
		mv.addObject("hairdresser",true);
		mv.addObject("designer",true);
		break;
	case "E" :
		mv.addObject("job1","プログラマー、CADオペレーター");
		mv.addObject("job2","歯科技師");
		mv.addObject("job3","トリマー");
		
		mv.addObject("programmer",true);
		mv.addObject("dentaltechnician",true);
		mv.addObject("trimmer",true);
		break;
	case "F" :
		mv.addObject("job1","医師");
		mv.addObject("job2","研究者");
		mv.addObject("job3","SE（システムエンジニア）");
		
		mv.addObject("doctor",true);
		mv.addObject("researcher",true);
		mv.addObject("systemengineers",true);
		break;
	}
	mv.addObject("userData",new UserData());
	mv.setViewName("video");
	return mv;
}


//---------ユーザー登録---------

@GetMapping("/video")
public String getVideo(UserData userData) {

  return "video";
}

@PostMapping("/")
public ModelAndView checkPersonInfo(@Valid @ModelAttribute ("userData") UserData userData,
		BindingResult bindingResult,@RequestParam("result") String A,ModelAndView mv) {
		System.out.println(A);
		
		
  if (bindingResult.hasErrors()) {
	  switch(A) {
		case "A":
			mv.addObject("helper",true);
			mv.addObject("instructor",true);
			mv.addObject("counselor",true);
			break;
		case "B" :
			
			mv.addObject("management",true);
			mv.addObject("sales",true);
			mv.addObject("entrepreneur",true);
			break;
		case "C" :
			
			
			mv.addObject("accounting",true);
			mv.addObject("secretary",true);
			mv.addObject("dataentry",true);
			break;
		case "D" :
			
			mv.addObject("productdvelopment",true);
			mv.addObject("hairdresser",true);
			mv.addObject("designer",true);
			break;
		case "E" :
			
			mv.addObject("programmer",true);
			mv.addObject("dentaltechnician",true);
			mv.addObject("trimmer",true);
			break;
		case "F" :
			
			mv.addObject("doctor",true);
			mv.addObject("researcher",true);
			mv.addObject("systemengineers",true);
			break;
		}
	  
	  mv.setViewName("video");
	  return mv;
  }
  
//登録データでのログイン機能を追加
  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
  userData.setPass(passwordEncoder.encode(userData.getPass()));
  
//登録データでのログイン機能を追加 ここまで-----------
  

  repository.saveAndFlush(userData);
  return new ModelAndView("redirect:/home");
}


@RequestMapping(value="/", method = RequestMethod.GET)
public ModelAndView indexGet(ModelAndView mv) {
	List<UserData>customers = repository.findAll();	
	mv.addObject("customers",customers);
	mv.setViewName("index");
	return mv;
}

//@RequestMapping(value="/duser",method = RequestMethod.POST)
//public ModelAndView deleteUser(
////		@RequestParam("userid")Long id,
//		ModelAndView mv) {
////	System.out.println(id);
////	repository.deleteById(id);
////	return new ModelAndView("redirect:/index");
////	return new ModelAndView("redirect:/memory");
//	mv.setViewName("index");
//	return mv;
//}
//@RequestMapping(value="/duser",method=RequestMethod.POST)
//public ModelAndView duserDelete(
////		@RequestParam("userid")Long id,
//ModelAndView mv) {
////	System.out.println(id);
////	repository.deleteById(id);
//	return new ModelAndView("redirect:/memory");
//}
@RequestMapping(value="/duser" , method = RequestMethod.POST)
public ModelAndView sagata(ModelAndView mv) {
 return new ModelAndView("redirect:/");
}


//---------------ここまでーーーーーーーーーーーーーーーー



//---------------1:多の作成ーーーーーーーーーーーーーーーー


@RequestMapping(value="/memory", method = RequestMethod.GET)
public ModelAndView memoryGet(ModelAndView mv) {
List<ContentData>content = contentrepository.findAll();	
mv.addObject("contentList",content);
mv.setViewName("memory");
return mv;
}
@RequestMapping(value="/memory" ,method = RequestMethod.POST)
public ModelAndView memoryPost(ModelAndView mv,@RequestParam
("content")String memo,HttpServletRequest httpServletRequest) {
	
	String name = httpServletRequest.getRemoteUser();
	System.out.println(name);
	UserData user = repository.findByMail(name);
	ContentData contentdata = new ContentData();
	System.out.println(user);
	contentdata.setUser(user);
	contentdata.setContent(memo);
	contentrepository.saveAndFlush(contentdata);
	return new ModelAndView("redirect:/memory");
}
@RequestMapping(value="/delete",method=RequestMethod.POST)
public ModelAndView delete(@RequestParam("contentD")Long id,
ModelAndView mv) {
	System.out.println(id);
	contentrepository.deleteById(id);
	return new ModelAndView("redirect:/memory");
}

//---------------1:多の作成ここまでーーーーーーーーーーーーーーーー

//-------参考になった数-------


@RequestMapping(value="/point",method = RequestMethod.POST)
public ModelAndView pointPost(@RequestParam("point") long gdButton,
		ModelAndView mv) {
	GoodButton good = goodRepository.findById((long)1).get();
	gdButton += good.getPoint();
	good.setPoint(gdButton);
	
	System.out.println("現在の参考になった数は"+gdButton);
	mv.addObject("points",gdButton);	
	goodRepository.saveAndFlush(good); 
	return new ModelAndView("redirect:/home");
}

@RequestMapping(value="/point", method = RequestMethod.GET)
public ModelAndView pointGet(ModelAndView mv) {
	GoodButton good = goodRepository.findById((long)1).get();
	mv.addObject("points",good.getPoint());
	mv.setViewName("point");
	return mv;
}
//--------------------mypageの表示--------------------

@RequestMapping(value="mypage",method = RequestMethod.GET)
	public ModelAndView mypageGet(ModelAndView mv,HttpServletRequest httpServletRequest){
	String name = httpServletRequest.getRemoteUser();
	System.out.println(name);
	UserData user = repository.findByMail(name);	
	List<ContentData> myContent = contentrepository.findByUser(user);
	mv.addObject("contentList",myContent);
	mv.setViewName("mypage");
	return mv;
}
//@RequestMapping(value="mypage",method = RequestMethod.GET)
//public ModelAndView mypageGet(ModelAndView mv){
//	List<ContentData>content = contentrepository.findByName();	
//	mv.addObject("contentList",content);
//	mv.setViewName("mypage");
//	return mv;
//}








@RequestMapping(value="/deleteMyContent",method=RequestMethod.POST)
public ModelAndView deleteMyContent(@RequestParam("mycontent")Long id,
ModelAndView mv) {
	contentrepository.deleteById(id);
	return new ModelAndView("redirect:/mypage");
}





//------------ここからお問合せフォーム------------

@RequestMapping("/contact")
public String contact(@ModelAttribute("form") Form ContactForm,
        Model model, HttpServletRequest request) {
//		model.addAttribute("form", new Form());なくてもいけた
     return "contact";
}
@RequestMapping(value = "/contact", method = RequestMethod.POST)
public String input(@Valid @ModelAttribute("form") Form Form,
BindingResult bindingResult, Model model, HttpServletRequest request) {

    // エラーがある場合、自画面遷移する
    if (bindingResult.hasErrors()) {
        return "contact";
    }

    HttpSession session = request.getSession();
    session.setAttribute("form", Form);
    return "redirect:/confirm";
    
}
@RequestMapping("/confirm")
public String confirm(
        Model model, HttpServletRequest request) {

    HttpSession session = request.getSession();
    Form Form = (Form) session.getAttribute("form");
    model.addAttribute("form",Form);
    return "confirm";
}
@RequestMapping("/complete")
public String complete(
        @ModelAttribute("form") Form ContactForm,
        Model model, HttpServletRequest request) {

    model.addAttribute("form",ContactForm );
    return "complete";
}


//＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝出来ていない部分＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝

//IDの削除ができない


}