package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class GroupLinkBundle {
    @Tag(tag=7) public Boolean isActivated = null;
    @Tag(tag=6) public Vector center = null;
    @Tag(tag=8) public Integer sceneId = null;
    @Tag(tag=13) public Integer radius = null;
    @Tag(tag=12) public Boolean isShowMark = null;
    @Tag(tag=9) public Integer bundleId = null;
}
