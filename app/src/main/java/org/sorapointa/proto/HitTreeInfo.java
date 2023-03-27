package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HitTreeInfo {
    @Tag(tag=1) public Integer treeType = null;
    @Tag(tag=2) public Vector treePos = null;
}
