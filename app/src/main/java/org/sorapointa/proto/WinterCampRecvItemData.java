package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class WinterCampRecvItemData {
    @Tag(tag=9) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=2) public ProfilePicture profilePicture = null;
    @Tag(tag=8) public String nickname = null;
    @Tag(tag=3) public Integer uid = null;
}
