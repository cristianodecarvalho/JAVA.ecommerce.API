package com.cristiano.ecommerce.service.admin.faq;

import com.cristiano.ecommerce.dto.FAQDto;
import com.cristiano.ecommerce.entity.FAQ;
import com.cristiano.ecommerce.entity.Product;
import com.cristiano.ecommerce.repository.FAQRepository;
import com.cristiano.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FAQServiceImpl implements FAQService {

    private final FAQRepository faqRepository;
    private final ProductRepository productRepository;

    public FAQDto postFAQ(Long productId, FAQDto faqDto) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(optionalProduct.isPresent()){
            FAQ faq = new FAQ();

            faq.setQuestion(faqDto.getQuestion());
            faq.setAnswer(faqDto.getAnswer());
            faq.setProduct(optionalProduct.get());

            return faqRepository.save(faq).getFaqDto();

        }
        return null;
    }

}
