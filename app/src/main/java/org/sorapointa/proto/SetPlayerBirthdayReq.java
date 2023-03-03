package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Birthday.*;
import org.sorapointa.proto.Birthday;

public class SetPlayerBirthdayReq {
    @Tag(tag=9) public Birthday birthday = null;
}
