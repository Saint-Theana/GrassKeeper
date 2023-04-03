package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class CrucibleBattleUidInfo {
    @Tag(tag=4) public String nickname = null;
    @Tag(tag=5) public Integer icon = null;
    @Tag(tag=2) public Integer uid = null;
    @Tag(tag=11) public ProfilePicture profilePicture = null;
    @Tag(tag=6) public String onlineId = null;
}
