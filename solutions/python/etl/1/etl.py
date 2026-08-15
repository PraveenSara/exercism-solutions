def transform(legacy_data):

    keys = list(legacy_data.keys())
    val = list(legacy_data.values())

    result = {}

    for i in range(len(keys)):
        for j in val[i]:
            result[j.lower()] = keys[i]

    return result
