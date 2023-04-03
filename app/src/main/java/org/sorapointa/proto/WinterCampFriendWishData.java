package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class WinterCampFriendWishData {
    @Tag(tag=8) public Integer uid = null;
    @Tag(tag=14) public List<Integer> itemIdList = new ArrayList<>();
    @Tag(tag=7) public String nickname = null;
    @Tag(tag=9) public ProfilePicture profilePicture = null;
}
