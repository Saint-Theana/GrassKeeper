package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DynamicSVONode {
    @Tag(tag=13,isSigned=true) public Integer area = null;
    @Tag(tag=11,isSigned=true) public Long index = null;
    @Tag(tag=9) public Vector referPos = null;
}
