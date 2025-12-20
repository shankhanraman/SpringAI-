package guru.springframework.springaiintro.controllers;

import guru.springframework.springaiintro.model.Answer;
import guru.springframework.springaiintro.model.GetCapitalRequest;
import guru.springframework.springaiintro.model.Question;
import guru.springframework.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class that exposes REST endpoints for asking questions
 * and retrieving capital cities using OpenAIService.
 */
@RestController
public class QuestionController {
    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }
    /**
     * Endpoint: POST /capital
     * Accepts a JSON request body containing a country name (GetCapitalRequest),
     * and returns the capital city wrapped in an Answer object.
     *
     * Example request:
     * POST /capital
     * {
     *   "country": "France"
     * }
     *
     * Example response:
     * {
     *   "answer": "Paris"
     * }
     */

    @PostMapping("/capital")
    public Answer getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapital(getCapitalRequest);
    }
        /**
     * Endpoint: POST /ask
     * Accepts a JSON request body containing a general question (Question),
     * and returns an Answer object with the response from OpenAI.
     *
     * Example request:
     * POST /ask
     * {
     *   "question": "What is the tallest mountain in the world?"
     * }
     *
     * Example response:
     * {
     *   "answer": "Mount Everest"
     * }
     */
    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }
}
