package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QueryFilter {
    @Tag(tag=9,isSigned=true) public Integer areaMask = null;
    @Tag(tag=3,isSigned=true) public Integer typeId = null;
}
