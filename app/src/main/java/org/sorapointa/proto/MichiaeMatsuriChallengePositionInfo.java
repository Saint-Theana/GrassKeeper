package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class MichiaeMatsuriChallengePositionInfo {
    @Tag(tag=5) public Integer groupId = null;
    @Tag(tag=14) public Integer gadgetId = null;
    @Tag(tag=13) public Vector pos = null;
}
