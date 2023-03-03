package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class GroupLinkBundle {
    @Tag(tag=4) public Vector center = null;
    @Tag(tag=12) public Boolean isActivated = null;
    @Tag(tag=3) public Integer bundleId = null;
    @Tag(tag=14) public Boolean isShowMark = null;
    @Tag(tag=5) public Integer sceneId = null;
    @Tag(tag=1) public Integer radius = null;
}
