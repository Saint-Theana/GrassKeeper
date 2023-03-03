package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityClientData.*;
import org.sorapointa.proto.EntityClientData;

public class SetEntityClientDataNotify {
    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=9) public EntityClientData entityClientData = null;
}
