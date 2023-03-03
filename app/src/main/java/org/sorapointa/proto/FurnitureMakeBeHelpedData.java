package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class FurnitureMakeBeHelpedData {
    @Tag(tag=12,isFixed=true) public Integer time = null;
    @Tag(tag=11) public Integer icon = null;
    @Tag(tag=7) public Integer uid = null;
    @Tag(tag=10) public String playerName = null;
    @Tag(tag=1) public ProfilePicture profilePicture = null;
}
