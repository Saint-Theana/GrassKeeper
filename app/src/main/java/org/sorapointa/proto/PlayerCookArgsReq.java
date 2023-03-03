package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCookArgsReq {
    @Tag(tag=10) public Integer assistAvatar = null;
    @Tag(tag=11) public Integer recipeId = null;
}
