package com.cristiano.ecommerce.service.admin.faq;

import com.cristiano.ecommerce.dto.FAQDto;

public interface FAQService {

    FAQDto postFAQ(Long productId, FAQDto faqDto);
}
