package com.quest.mapper;

import com.quest.athene.domain.model.Answer;
import com.quest.athene.domain.model.Question;
import com.quest.athene.domain.model.QuestionTitle;

import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public interface QuestionMapper {

    //! 提交一个问题
    public void submitQestion (Question question);

    //! 纠正一个问题
    public void fixQuestion(Question content);

    //! 模糊查找问题
    public List<QuestionTitle> findQuestionTitleByFuzzyInput(String input);

    //! 查找问题有多少个答案，在联想问题标题的时候 需要显示
    public int lookupCountOfAnswersByQuestionId(long questionId);

    //! 为问题添加一个答案
    public void addAnswerForQuestion(Answer answer);

    //! 根据问题ID 更新投票数
    public void updateVoteForAnswer(long answerId);


//    public Question findQuestionByAuthor(String author);
//
//    public Question findQuestionByTag (String tag) {
//
//
//    }
//
//    public Question findQuestionByTitle (String title) {
//
//
//    }
//
//    public Question findQuestionByTagId (String tagId) {
//
//
//    }
//
//    public Question findQuestionByState (String state) {
//
//
//    }
//
    public QuestionTitle findTitleByTitleContent (String titleContent) ;

//
    public void saveQuestionTitle(QuestionTitle title);
}