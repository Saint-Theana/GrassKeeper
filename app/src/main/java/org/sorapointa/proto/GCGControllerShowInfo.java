package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class GCGControllerShowInfo {
    @Tag(tag=11) public ProfilePicture profilePicture = null;
    @Tag(tag=14) public String nickName = null;
    @Tag(tag=9) public Integer controllerId = null;
}
