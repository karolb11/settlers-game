package com.broniec.settlers.client.villagesList;

import com.broniec.settlers.security.UserPrincipal;
import com.broniec.settlers.user.CurrentUser;
import com.broniec.settlers.village.VillageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class VillagesListController {
    private final VillageService villageService;

    @GetMapping("/overview")
    public String overView(Model model, @CurrentUser UserPrincipal currentUser) {
        if(!villageService.userHasVillages(currentUser.getId()))
            return "buildVillage";
        model.addAttribute("username", currentUser.getUsername());
        return "hello";
    }
}