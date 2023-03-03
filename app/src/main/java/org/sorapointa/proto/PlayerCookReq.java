package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCookReq {
    @Tag(tag=1) public Integer cookCount = null;
    @Tag(tag=12) public Integer qteQuality = null;
    @Tag(tag=8) public Integer recipeId = null;
    @Tag(tag=14) public Integer assistAvatar = null;
}
