package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class SetPlayerHeadImageRsp {
    @Tag(tag=6) public ProfilePicture profilePicture = null;
    @Tag(tag=5) public Integer avatarId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
