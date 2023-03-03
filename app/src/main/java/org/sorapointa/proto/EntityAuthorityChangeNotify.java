package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AuthorityChange.*;
import org.sorapointa.proto.AuthorityChange;

public class EntityAuthorityChangeNotify {
    @Tag(tag=15) public List<AuthorityChange> authorityChangeList = new ArrayList<>();
}
