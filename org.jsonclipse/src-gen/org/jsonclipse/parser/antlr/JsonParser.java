/*
* generated by Xtext
*/
package org.jsonclipse.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.jsonclipse.services.JsonGrammarAccess;

public class JsonParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private JsonGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.jsonclipse.parser.antlr.internal.InternalJsonParser createParser(XtextTokenStream stream) {
		return new org.jsonclipse.parser.antlr.internal.InternalJsonParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public JsonGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JsonGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
