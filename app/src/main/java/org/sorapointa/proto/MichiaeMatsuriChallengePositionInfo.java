package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class MichiaeMatsuriChallengePositionInfo {
    @Tag(tag=4) public Integer groupId = null;
    @Tag(tag=7) public Integer gadgetId = null;
    @Tag(tag=8) public Vector pos = null;
}
