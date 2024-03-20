package com.cristiano.ecommerce.service.customer.wishlist;

import com.cristiano.ecommerce.dto.WishlistDto;

import java.util.List;

public interface WishlistService {

    WishlistDto addProductToWishlist(WishlistDto wishlistDto);
    List<WishlistDto> getWishlistByUserId(Long userId);
}
