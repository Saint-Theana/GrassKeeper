package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GroupLinkBundle.*;
import org.sorapointa.proto.GroupLinkBundle;

public class GroupLinkChangeNotify {
    @Tag(tag=8) public GroupLinkBundle bundle = null;
}
