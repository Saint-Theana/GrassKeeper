package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HitTreeInfo {
    @Tag(tag=1) public Integer treeType = null;
    @Tag(tag=2) public Vector treePos = null;
}
