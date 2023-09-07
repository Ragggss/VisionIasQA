package org.pageobjectmanager;

import org.pageclasspackage.CurrentAffairsPage;
import org.pageclasspackage.HomePage;
import org.pageclasspackage.InfographicsPage;
import org.pageclasspackage.PersonalityInterviewPage;
import org.pageclasspackage.LoginPage;
import org.pageclasspackage.Mains365Page;
import org.pageclasspackage.MainsTestSeriesPage;
import org.pageclasspackage.MonthlyCurrentAffairsPage;
import org.pageclasspackage.PT365Page;
import org.pageclasspackage.ResearchAndAnalysisPage;
import org.pageclasspackage.ResourcesPage;
import org.pageclasspackage.SignupRandomPage;
import org.pageclasspackage.SmartQuizPage;
import org.pageclasspackage.ToppersAnswerCopyPage;
import org.pageclasspackage.ValueAddedMaterialPage;
import org.pageclasspackage.WeeklyFocusPage;

public class PageObjectManager {

	
	
	public LoginPage loginPage;
	public HomePage homepage;
	public ResourcesPage resourcespage;
	public InfographicsPage infographicspage;
	public WeeklyFocusPage weeklyfocuspage;
	public MonthlyCurrentAffairsPage monthlyCurrentAffairsPage;
	public CurrentAffairsPage currentAffairsPage;
	public PT365Page pt365;
	public Mains365Page mains365;
	public ValueAddedMaterialPage valueAddedMaterialPage;
	public ToppersAnswerCopyPage toppersAnswerCopyPage;
	public ResearchAndAnalysisPage researchAndAnalysis;
	public SmartQuizPage smartQuizPage;
	public PersonalityInterviewPage personalityInterviewPage;
	public MainsTestSeriesPage mainsTestSeriesPage;
	public SignupRandomPage signupRandomPage;
	
	

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public HomePage getHomePage() {
		return (homepage == null) ? homepage = new HomePage() : homepage;
	}

	public ResourcesPage getResourcesPage() {
		return (resourcespage == null) ? resourcespage = new ResourcesPage() : resourcespage;
	}

	public InfographicsPage getInfographicsPage() {
		return (infographicspage == null) ? infographicspage = new InfographicsPage() : infographicspage;
	}

	public WeeklyFocusPage getWeeklyFocusPage() {
		return (weeklyfocuspage == null) ? weeklyfocuspage = new WeeklyFocusPage() : weeklyfocuspage;
	}

	public MonthlyCurrentAffairsPage getMonthlyCurrentAffairsPage() {
		return (monthlyCurrentAffairsPage == null) ? monthlyCurrentAffairsPage = new MonthlyCurrentAffairsPage()
				: monthlyCurrentAffairsPage;
	}

	public CurrentAffairsPage getCurrentAffairsPage() {
		return (currentAffairsPage == null) ? currentAffairsPage = new CurrentAffairsPage() : currentAffairsPage;
	}

	public PT365Page getpt365() {
		return (pt365 == null) ? pt365 = new PT365Page() : pt365;
	}

	public Mains365Page getmains365() {
		return (mains365 == null) ? mains365 = new Mains365Page() : mains365;
	}

	public ValueAddedMaterialPage getvalueAddedMaterialPage() {
		return (valueAddedMaterialPage == null) ? valueAddedMaterialPage = new ValueAddedMaterialPage()
				: valueAddedMaterialPage;
	}

	public ToppersAnswerCopyPage getToppersAnswerCopyPage() {
		return (toppersAnswerCopyPage == null) ? toppersAnswerCopyPage = new ToppersAnswerCopyPage()
				: toppersAnswerCopyPage;
	}

	public ResearchAndAnalysisPage getResearchAndAnalysisPage() {
		return (researchAndAnalysis == null) ? researchAndAnalysis = new ResearchAndAnalysisPage()
				: researchAndAnalysis;
	}

	public SmartQuizPage getSmartQuizPage() {
		return (smartQuizPage == null) ? smartQuizPage = new SmartQuizPage() : smartQuizPage;
	}

	public PersonalityInterviewPage getInterviewPage() {
		return (personalityInterviewPage == null) ? personalityInterviewPage = new PersonalityInterviewPage() : personalityInterviewPage;
	}
	
	public MainsTestSeriesPage getMainsTestSeriesPage() {
		return (mainsTestSeriesPage == null) ? mainsTestSeriesPage = new MainsTestSeriesPage() : mainsTestSeriesPage;
	}

	public SignupRandomPage getSignupRandomPage() {
		return (signupRandomPage == null) ? signupRandomPage = new SignupRandomPage() : signupRandomPage;
	}


}
