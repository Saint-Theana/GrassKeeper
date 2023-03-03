package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HitTreeNotify {
    @Tag(tag=11) public Integer treeType = null;
    @Tag(tag=2) public Vector treePos = null;
    @Tag(tag=8) public Vector dropPos = null;
}
