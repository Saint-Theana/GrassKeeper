package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class MichiaeMatsuriChestPositionInfo {
    @Tag(tag=4) public Integer groupId = null;
    @Tag(tag=13) public Vector pos = null;
    @Tag(tag=2) public Integer configId = null;
}
