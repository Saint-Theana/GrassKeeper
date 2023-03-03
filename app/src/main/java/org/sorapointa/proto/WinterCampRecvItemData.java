package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class WinterCampRecvItemData {
    @Tag(tag=2) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=8) public Integer uid = null;
    @Tag(tag=1) public ProfilePicture profilePicture = null;
    @Tag(tag=12) public String nickname = null;
}
