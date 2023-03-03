package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class DynamicSVONode {
    @Tag(tag=8,isSigned=true) public Long index = null;
    @Tag(tag=5,isSigned=true) public Integer area = null;
    @Tag(tag=1) public Vector referPos = null;
}
