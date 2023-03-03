package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class CrucibleBattleUidInfo {
    @Tag(tag=15) public ProfilePicture profilePicture = null;
    @Tag(tag=4) public Integer uid = null;
    @Tag(tag=5) public String nickname = null;
    @Tag(tag=13) public String onlineId = null;
    @Tag(tag=11) public Integer icon = null;
}
